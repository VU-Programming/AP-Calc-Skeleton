/** 
 * @elements numbers of the type Double
 * @structure linear
 * @domain all rows of Doubles
 **/
public interface DoubleStack {

    /**
     * @pre -
     * @post Double element is now at the top of the stack.
     */
    void push(Double element);

    /**
     * @pre The stack is not empty
     * @post The element at the top of the stack is returned and deleted.
     */
    Double pop();

    /**
     * @pre The stack is not empty
     * @post The element at the top of the stack is returned.
     */
    Double top();

    /**
     * @post The number of elements on the stack is returned
     */
    int size();
}
