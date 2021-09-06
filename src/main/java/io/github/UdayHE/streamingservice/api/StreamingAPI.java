package io.github.UdayHE.streamingservice.api;

import io.github.UdayHE.streamingservice.service.IStreamingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@AllArgsConstructor
public class StreamingAPI {

    private final IStreamingService streamingService;

    @GetMapping(value = "/video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideo(@PathVariable String title, @RequestHeader("Range") String range) {
        log.info("range in bytes:{}", range);
        return streamingService.getVideo(title);
    }
}
