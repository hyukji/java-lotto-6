package lotto.exception;

import static lotto.Constants.LOTTO_NUMBER_COUNT;
import static lotto.Constants.MAX_RANDOM_NUMBER;
import static lotto.Constants.MIN_RANDOM_NUMBER;
import static lotto.Constants.TICKET_PRICE;

public enum LottoErrorCode {
    NOT_INTEGER_INPUT("숫자만 입력이 가능합니다."),
    BLANK_INPUT("빈 값은 입력이 불가능 합니다."),
    NOT_POSITIVE_INTEGER_INPUT("양수만 입력이 가능합니다."),

    LOTTO_NUMBER_DUPLICATE("로또 숫자들은 중복이 불가능합니다."),
    LOTTO_NUMBER_RANGE(
        String.format("로또 숫자들은 %d와 %d 숫자로 구성되어야 합니다.", MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER)),
    LOTTO_NUMBER_SIZE(String.format("로또는 %d개의 숫자로 구성되어야 합니다.", LOTTO_NUMBER_COUNT)),

    TICKET_PRICE_UNIT(String.format("티켓 가격 %d원 단위로 구매가 가능합니다.", TICKET_PRICE));

    private final String message;

    LottoErrorCode(final String errorMessage) {
        message = errorMessage;
    }

    public String getMessage() {
        final String prefix = "[ERROR] ";
        return prefix + message;
    }

}