package racingcar.service;

import static racingcar.validation.Inputvalidator.validateCarNames;

public class RacingGameService {
    public void processRacingCars(String racingCars, String tryNumber) {
        String[] cars = racingCars.split(",");

        validateCarNames(cars);
    }
}