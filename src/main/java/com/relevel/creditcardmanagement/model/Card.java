package com.relevel.creditcardmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {

    @Id
    private long card_id;
}
