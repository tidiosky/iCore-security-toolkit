/**
 */
package behavior.type.action.util;

import behavior.type.AbstractDataProducerType;
import behavior.type.ActionType;
import behavior.type.ActivityType;
import behavior.type.DataProducerType;

import behavior.type.action.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.type.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ActionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ActionPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionSwitch<Adapter> modelSwitch =
        new ActionSwitch<Adapter>() {
            @Override
            public Adapter caseCreate(Create object) {
                return createCreateAdapter();
            }
            @Override
            public Adapter caseRead(Read object) {
                return createReadAdapter();
            }
            @Override
            public Adapter caseUpdate(Update object) {
                return createUpdateAdapter();
            }
            @Override
            public Adapter caseDelete(Delete object) {
                return createDeleteAdapter();
            }
            @Override
            public Adapter casePersistenceStorageActionType(PersistenceStorageActionType object) {
                return createPersistenceStorageActionTypeAdapter();
            }
            @Override
            public Adapter caseHumanAction(HumanAction object) {
                return createHumanActionAdapter();
            }
            @Override
            public Adapter caseDiscoverEntity(DiscoverEntity object) {
                return createDiscoverEntityAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAbstractDataProducerType(AbstractDataProducerType object) {
                return createAbstractDataProducerTypeAdapter();
            }
            @Override
            public Adapter caseDataProducerType(DataProducerType object) {
                return createDataProducerTypeAdapter();
            }
            @Override
            public Adapter caseActivityType(ActivityType object) {
                return createActivityTypeAdapter();
            }
            @Override
            public Adapter caseActionType(ActionType object) {
                return createActionTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.Create <em>Create</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.Create
     * @generated
     */
    public Adapter createCreateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.Read <em>Read</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.Read
     * @generated
     */
    public Adapter createReadAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.Update <em>Update</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.Update
     * @generated
     */
    public Adapter createUpdateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.Delete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.Delete
     * @generated
     */
    public Adapter createDeleteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.PersistenceStorageActionType <em>Persistence Storage Action Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.PersistenceStorageActionType
     * @generated
     */
    public Adapter createPersistenceStorageActionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.HumanAction <em>Human Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.HumanAction
     * @generated
     */
    public Adapter createHumanActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.action.DiscoverEntity <em>Discover Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.action.DiscoverEntity
     * @generated
     */
    public Adapter createDiscoverEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.AbstractDataProducerType <em>Abstract Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.AbstractDataProducerType
     * @generated
     */
    public Adapter createAbstractDataProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.DataProducerType <em>Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.DataProducerType
     * @generated
     */
    public Adapter createDataProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.ActivityType <em>Activity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.ActivityType
     * @generated
     */
    public Adapter createActivityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.ActionType <em>Action Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.ActionType
     * @generated
     */
    public Adapter createActionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ActionAdapterFactory
