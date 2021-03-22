package com.ricko.cookbook.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntityWithId {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @Setter(value = AccessLevel.NONE)
    @Getter
    private Long id;

}
