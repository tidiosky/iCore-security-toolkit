/**
 */
package data.event;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.event.EventPackage
 * @generated
 */
public interface EventFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventFactory eINSTANCE = data.event.impl.EventFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Data Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Event</em>'.
     * @generated
     */
    DataEvent createDataEvent();

    /**
     * Returns a new object of class '<em>Data Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Event Pattern</em>'.
     * @generated
     */
    DataEventPattern createDataEventPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EventPackage getEventPackage();

} //EventFactory
