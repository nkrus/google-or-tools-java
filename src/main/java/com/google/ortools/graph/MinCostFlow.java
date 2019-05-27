/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.graph;

public class MinCostFlow extends MinCostFlowBase {
  private transient long swigCPtr;

  protected MinCostFlow(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.MinCostFlow_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MinCostFlow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_MinCostFlow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MinCostFlow() {
    this(mainJNI.new_MinCostFlow(), true);
  }

  public int addArcWithCapacityAndUnitCost(int tail, int head, long capacity, long unit_cost) {
    return mainJNI.MinCostFlow_addArcWithCapacityAndUnitCost(swigCPtr, this, tail, head, capacity, unit_cost);
  }

  public void setNodeSupply(int node, long supply) {
    mainJNI.MinCostFlow_setNodeSupply(swigCPtr, this, node, supply);
  }

  public MinCostFlowBase.Status solve() {
    return MinCostFlowBase.Status.swigToEnum(mainJNI.MinCostFlow_solve(swigCPtr, this));
  }

  public MinCostFlowBase.Status solveMaxFlowWithMinCost() {
    return MinCostFlowBase.Status.swigToEnum(mainJNI.MinCostFlow_solveMaxFlowWithMinCost(swigCPtr, this));
  }

  public long getOptimalCost() {
    return mainJNI.MinCostFlow_getOptimalCost(swigCPtr, this);
  }

  public long getMaximumFlow() {
    return mainJNI.MinCostFlow_getMaximumFlow(swigCPtr, this);
  }

  public long getFlow(int arc) {
    return mainJNI.MinCostFlow_getFlow(swigCPtr, this, arc);
  }

  public int getNumNodes() {
    return mainJNI.MinCostFlow_getNumNodes(swigCPtr, this);
  }

  public int getNumArcs() {
    return mainJNI.MinCostFlow_getNumArcs(swigCPtr, this);
  }

  public int getTail(int arc) {
    return mainJNI.MinCostFlow_getTail(swigCPtr, this, arc);
  }

  public int getHead(int arc) {
    return mainJNI.MinCostFlow_getHead(swigCPtr, this, arc);
  }

  public long getCapacity(int arc) {
    return mainJNI.MinCostFlow_getCapacity(swigCPtr, this, arc);
  }

  public long getSupply(int node) {
    return mainJNI.MinCostFlow_getSupply(swigCPtr, this, node);
  }

  public long getUnitCost(int arc) {
    return mainJNI.MinCostFlow_getUnitCost(swigCPtr, this, arc);
  }

}
