package services;


import reactor.core.publisher.Mono;

public interface PersonService {
     Mono<String> myNameReactive();
}
