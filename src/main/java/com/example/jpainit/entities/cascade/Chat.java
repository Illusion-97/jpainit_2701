package com.example.jpainit.entities.cascade;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
public class Chat extends BaseEntity {
    private boolean pickpocket;
    private boolean lazy;

    public boolean isPickpocket() {
        return pickpocket;
    }

    public Chat setPickpocket(boolean pickpocket) {
        this.pickpocket = pickpocket;
        return this;
    }

    public boolean isLazy() {
        return lazy;
    }

    public Chat setLazy(boolean lazy) {
        this.lazy = lazy;
        return this;
    }
}
