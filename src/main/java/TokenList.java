/**
 * @elements Tokens of the type Token
 * @structure linear
 * @domain All lists of tokens
 */
interface TokenList {

    /**
     * @pre -
     * @post The token 'token' has been added at the end of the TokenList, 
     *       preserving the previous order.
     */
    void add(Token token);


    /**
     *
     * @pre index < size() and index >= 0
     * @post The element at location 'index' has been removed, preserving the previous order. The size of the TokenList has been reduced by 1.
     */
    void remove(int index);

    /**
     *
     * @param index The index to be set
     * @param token The value to set the element at location index to.
     * @pre   index < size();
     * @post  The element at location 'index' has the value 'token', preserving the previous order.
     */
    void set(int index, Token token);

    /**
     *
     * @param index The index of the element to be returned.
     * @return The element and index index.
     * @pre index < size();
     * @post The element at index 'index' has been returned.
     */
    Token get(int index);

    /**
     * @pre -
     * @post The number of elements in the list has been returned.
     */
    int size();


}
