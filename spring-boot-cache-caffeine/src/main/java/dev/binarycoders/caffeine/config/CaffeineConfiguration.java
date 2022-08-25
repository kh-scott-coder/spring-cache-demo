package dev.binarycoders.caffeine.config;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

import dev.binarycoders.caffeine.utils.CacheEventLogger;

@Configuration
@EnableCaching
public class CaffeineConfiguration { // CaffeineConfig bean already exists

    @Bean
    @SuppressWarnings("all")
    public Caffeine caffeineConfig() {
        return Caffeine.newBuilder()
            .maximumSize(50)
            .expireAfterWrite(10, TimeUnit.SECONDS)
            .removalListener(CacheEventLogger.removalListener());
    }

    @Bean
    @SuppressWarnings("all")
    public CacheManager cacheManager(final Caffeine caffeine) {
        final CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();

        caffeineCacheManager.setCaffeine(caffeine);

        return caffeineCacheManager;
    }
}
