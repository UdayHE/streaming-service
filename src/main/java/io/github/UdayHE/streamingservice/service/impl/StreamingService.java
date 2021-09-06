package io.github.UdayHE.streamingservice.service.impl;

import io.github.UdayHE.streamingservice.service.IStreamingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@Slf4j
@AllArgsConstructor
public class StreamingService implements IStreamingService {

    private static final String FORMAT = "classpath:videos/%s.mp4";

    private final ResourceLoader resourceLoader;

    @Override
    public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() -> resourceLoader.getResource(String.format(FORMAT, title)));
    }
}
