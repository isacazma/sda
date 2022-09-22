package nl.hu.bep2.casino.hetSpelBlackjack.presentation.dto;

import javax.validation.constraints.Positive;

public class DepositGame {
    @Positive
    public Long betAmount;
}
