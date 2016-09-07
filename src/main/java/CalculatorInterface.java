interface CalculatorInterface {

    /*
     * @param in String of tokens to be parsed
     * @return the list of arithmetic tokens from the String input
     */
    TokenList readTokens(String input);

    /*
     * @param tokens A list of tokens signifying an RPN expression.
     * @return The result of the RPN expression.
     */
    Double rpn(TokenList tokens);

    /*
     * @param tokens A list of tokens signifying an arithmetic expression.
     * @return The arithmetic expression tokens converted into
     * Reverse-Polish-Notation.
     */
    TokenList shuntingYard(TokenList tokens);
}
