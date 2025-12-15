package com.designpatterns.creational.prototype;

import java.util.Optional;

public record CircleUpdate(Optional<Integer> x, Optional<Integer> y, Optional<Integer> radius, Optional<String> color) {
}
