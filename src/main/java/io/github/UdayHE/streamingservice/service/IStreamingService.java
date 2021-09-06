package io.github.UdayHE.streamingservice.service;

import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;

public interface IStreamingService {
    Mono<Resource> getVideo(String title);
}
