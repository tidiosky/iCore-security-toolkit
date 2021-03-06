/**
 */
package identity;

import identity.type.IdentityTypePackage;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.IdentityDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.IdentityPackage#getIdentityDesignModel()
 * @model
 * @generated
 */
public interface IdentityDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.IdentityTypePackage}.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see identity.IdentityPackage#getIdentityDesignModel_Packages()
     * @see identity.type.IdentityTypePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<IdentityTypePackage> getPackages();

} // IdentityDesignModel
