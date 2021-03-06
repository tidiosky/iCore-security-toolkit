/**
 */
package rule.condition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Truth Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rule.condition.ConditionPackage#getTruthValue()
 * @model
 * @generated
 */
public enum TruthValue implements Enumerator {
    /**
     * The '<em><b>UNDETERMINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNDETERMINED_VALUE
     * @generated
     * @ordered
     */
    UNDETERMINED(0, "UNDETERMINED", "UNDETERMINED"),

    /**
     * The '<em><b>TRUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRUE_VALUE
     * @generated
     * @ordered
     */
    TRUE(1, "TRUE", "TRUE"),

    /**
     * The '<em><b>FALSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FALSE_VALUE
     * @generated
     * @ordered
     */
    FALSE(2, "FALSE", "FALSE");

    /**
     * The '<em><b>UNDETERMINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNDETERMINED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNDETERMINED
     * @model
     * @generated
     * @ordered
     */
    public static final int UNDETERMINED_VALUE = 0;

    /**
     * The '<em><b>TRUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TRUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRUE
     * @model
     * @generated
     * @ordered
     */
    public static final int TRUE_VALUE = 1;

    /**
     * The '<em><b>FALSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FALSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FALSE
     * @model
     * @generated
     * @ordered
     */
    public static final int FALSE_VALUE = 2;

    /**
     * An array of all the '<em><b>Truth Value</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TruthValue[] VALUES_ARRAY =
        new TruthValue[] {
            UNDETERMINED,
            TRUE,
            FALSE,
        };

    /**
     * A public read-only list of all the '<em><b>Truth Value</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TruthValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Truth Value</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TruthValue get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TruthValue result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Truth Value</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TruthValue getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TruthValue result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Truth Value</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TruthValue get(int value) {
        switch (value) {
            case UNDETERMINED_VALUE: return UNDETERMINED;
            case TRUE_VALUE: return TRUE;
            case FALSE_VALUE: return FALSE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private TruthValue(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //TruthValue
