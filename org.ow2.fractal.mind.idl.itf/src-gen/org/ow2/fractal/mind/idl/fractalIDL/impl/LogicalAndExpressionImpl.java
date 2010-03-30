/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;
import org.ow2.fractal.mind.idl.fractalIDL.LogicalAndExpression;
import org.ow2.fractal.mind.idl.fractalIDL.OrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.LogicalAndExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.LogicalAndExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalAndExpressionImpl extends MinimalEObjectImpl.Container implements LogicalAndExpression
{
  /**
   * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpr()
   * @generated
   * @ordered
   */
  protected OrExpression leftExpr;

  /**
   * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpr()
   * @generated
   * @ordered
   */
  protected LogicalAndExpression rightExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalAndExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalIDLPackage.Literals.LOGICAL_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression getLeftExpr()
  {
    return leftExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpr(OrExpression newLeftExpr, NotificationChain msgs)
  {
    OrExpression oldLeftExpr = leftExpr;
    leftExpr = newLeftExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpr(OrExpression newLeftExpr)
  {
    if (newLeftExpr != leftExpr)
    {
      NotificationChain msgs = null;
      if (leftExpr != null)
        msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR, null, msgs);
      if (newLeftExpr != null)
        msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeftExpr(newLeftExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAndExpression getRightExpr()
  {
    return rightExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpr(LogicalAndExpression newRightExpr, NotificationChain msgs)
  {
    LogicalAndExpression oldRightExpr = rightExpr;
    rightExpr = newRightExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpr(LogicalAndExpression newRightExpr)
  {
    if (newRightExpr != rightExpr)
    {
      NotificationChain msgs = null;
      if (rightExpr != null)
        msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR, null, msgs);
      if (newRightExpr != null)
        msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR, null, msgs);
      msgs = basicSetRightExpr(newRightExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR:
        return basicSetLeftExpr(null, msgs);
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR:
        return basicSetRightExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR:
        return getLeftExpr();
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR:
        return getRightExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR:
        setLeftExpr((OrExpression)newValue);
        return;
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR:
        setRightExpr((LogicalAndExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR:
        setLeftExpr((OrExpression)null);
        return;
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR:
        setRightExpr((LogicalAndExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__LEFT_EXPR:
        return leftExpr != null;
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION__RIGHT_EXPR:
        return rightExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicalAndExpressionImpl
