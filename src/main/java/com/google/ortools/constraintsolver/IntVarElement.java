/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class IntVarElement extends AssignmentElement {
  private transient long swigCPtr;

  protected IntVarElement(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.IntVarElement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVarElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_IntVarElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntVarElement() {
    this(operations_research_constraint_solverJNI.new_IntVarElement__SWIG_0(), true);
  }

  public IntVarElement(IntVar var) {
    this(operations_research_constraint_solverJNI.new_IntVarElement__SWIG_1(IntVar.getCPtr(var), var), true);
  }

  public void reset(IntVar var) {
    operations_research_constraint_solverJNI.IntVarElement_reset(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public IntVarElement clone() {
    long cPtr = operations_research_constraint_solverJNI.IntVarElement_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public void copy(IntVarElement element) {
    operations_research_constraint_solverJNI.IntVarElement_copy(swigCPtr, this, IntVarElement.getCPtr(element), element);
  }

  public IntVar var() {
    long cPtr = operations_research_constraint_solverJNI.IntVarElement_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public void store() {
    operations_research_constraint_solverJNI.IntVarElement_store(swigCPtr, this);
  }

  public void restore() {
    operations_research_constraint_solverJNI.IntVarElement_restore(swigCPtr, this);
  }

  public void LoadFromProto(SWIGTYPE_p_operations_research__IntVarAssignment int_var_assignment_proto) {
    operations_research_constraint_solverJNI.IntVarElement_LoadFromProto(swigCPtr, this, SWIGTYPE_p_operations_research__IntVarAssignment.getCPtr(int_var_assignment_proto));
  }

  public void WriteToProto(SWIGTYPE_p_operations_research__IntVarAssignment int_var_assignment_proto) {
    operations_research_constraint_solverJNI.IntVarElement_WriteToProto(swigCPtr, this, SWIGTYPE_p_operations_research__IntVarAssignment.getCPtr(int_var_assignment_proto));
  }

  public long min() {
    return operations_research_constraint_solverJNI.IntVarElement_min(swigCPtr, this);
  }

  public void setMin(long m) {
    operations_research_constraint_solverJNI.IntVarElement_setMin(swigCPtr, this, m);
  }

  public long max() {
    return operations_research_constraint_solverJNI.IntVarElement_max(swigCPtr, this);
  }

  public void setMax(long m) {
    operations_research_constraint_solverJNI.IntVarElement_setMax(swigCPtr, this, m);
  }

  public long value() {
    return operations_research_constraint_solverJNI.IntVarElement_value(swigCPtr, this);
  }

  public boolean bound() {
    return operations_research_constraint_solverJNI.IntVarElement_bound(swigCPtr, this);
  }

  public void setRange(long l, long u) {
    operations_research_constraint_solverJNI.IntVarElement_setRange(swigCPtr, this, l, u);
  }

  public void setValue(long v) {
    operations_research_constraint_solverJNI.IntVarElement_setValue(swigCPtr, this, v);
  }

  public String toString() {
    return operations_research_constraint_solverJNI.IntVarElement_toString(swigCPtr, this);
  }

}
