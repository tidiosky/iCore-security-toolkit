/**
 */
package models.variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.XPathVariableAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getXPathVariableAssignment()
 * @model
 * @generated
 */
public interface XPathVariableAssignment extends VariableAssignment {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see models.variable.VariablePackage#getXPathVariableAssignment_Expression()
     * @model
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link models.variable.XPathVariableAssignment#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // XPathVariableAssignment
