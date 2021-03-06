/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class OptimizeVar extends SearchMonitor {
  private transient long swigCPtr;

  protected OptimizeVar(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.OptimizeVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OptimizeVar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_OptimizeVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OptimizeVar(Solver s, boolean maximize, IntVar a, long step) {
    this(operations_research_constraint_solverJNI.new_OptimizeVar(Solver.getCPtr(s), s, maximize, IntVar.getCPtr(a), a, step), true);
  }

  public long best() {
    return operations_research_constraint_solverJNI.OptimizeVar_best(swigCPtr, this);
  }

  public IntVar Var() {
    long cPtr = operations_research_constraint_solverJNI.OptimizeVar_Var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public void enterSearch() {
    operations_research_constraint_solverJNI.OptimizeVar_enterSearch(swigCPtr, this);
  }

  public void beginNextDecision(DecisionBuilder db) {
    operations_research_constraint_solverJNI.OptimizeVar_beginNextDecision(swigCPtr, this, DecisionBuilder.getCPtr(db), db);
  }

  public void refuteDecision(Decision d) {
    operations_research_constraint_solverJNI.OptimizeVar_refuteDecision(swigCPtr, this, Decision.getCPtr(d), d);
  }

  public boolean atSolution() {
    return operations_research_constraint_solverJNI.OptimizeVar_atSolution(swigCPtr, this);
  }

  public boolean acceptSolution() {
    return operations_research_constraint_solverJNI.OptimizeVar_acceptSolution(swigCPtr, this);
  }

  public String Print() {
    return operations_research_constraint_solverJNI.OptimizeVar_Print(swigCPtr, this);
  }

  public String toString() {
    return operations_research_constraint_solverJNI.OptimizeVar_toString(swigCPtr, this);
  }

  public void accept(ModelVisitor visitor) {
    operations_research_constraint_solverJNI.OptimizeVar_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

  public void ApplyBound() {
    operations_research_constraint_solverJNI.OptimizeVar_ApplyBound(swigCPtr, this);
  }

}
