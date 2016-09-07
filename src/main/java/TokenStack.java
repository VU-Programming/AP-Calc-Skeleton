/**
 * @elements Tokens of the type Token
 * @structure linear
 * @domain all rows of tokens
 **/
public interface TokenStack {

    /**
     * @pre -
     * @post token Token is now at the top of the stack.
     */
    void push(Token token);

    /**
     * @pre The stack is not empty
     * @post The token at the top of the stack is returned and deleted.
     */
    Token pop();

    /**
     * @pre The stack is not empty
     * @post The token at the top of the stack is returned.
     */
    Token top();

    /**
     * @pre -
     * @post The number of elements on the stack is returned
     */
    int size();
}
