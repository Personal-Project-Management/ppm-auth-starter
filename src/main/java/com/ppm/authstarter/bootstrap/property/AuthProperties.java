package com.ppm.authstarter.bootstrap.property;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@ConfigurationProperties(prefix = "auth")
public class AuthProperties {
    List<String> permitAll = new ArrayList<>();
}
