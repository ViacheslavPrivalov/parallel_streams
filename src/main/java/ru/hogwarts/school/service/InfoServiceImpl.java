package ru.hogwarts.school.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService{
    private final Integer port;

    public InfoServiceImpl(@Value("${server.port}") Integer port) {
        this.port = port;
    }

    @Override
    public Integer getPort() {
        return port;
    }
}
