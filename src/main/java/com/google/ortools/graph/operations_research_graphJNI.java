/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.graph;

public class operations_research_graphJNI {
  public final static native long new_MaxFlow();
  public final static native int MaxFlow_addArcWithCapacity(long jarg1, MaxFlow jarg1_, int jarg2, int jarg3, long jarg4);
  public final static native int MaxFlow_getNumNodes(long jarg1, MaxFlow jarg1_);
  public final static native int MaxFlow_getNumArcs(long jarg1, MaxFlow jarg1_);
  public final static native int MaxFlow_getTail(long jarg1, MaxFlow jarg1_, int jarg2);
  public final static native int MaxFlow_getHead(long jarg1, MaxFlow jarg1_, int jarg2);
  public final static native long MaxFlow_getCapacity(long jarg1, MaxFlow jarg1_, int jarg2);
  public final static native int MaxFlow_solve(long jarg1, MaxFlow jarg1_, int jarg2, int jarg3);
  public final static native long MaxFlow_getOptimalFlow(long jarg1, MaxFlow jarg1_);
  public final static native long MaxFlow_getFlow(long jarg1, MaxFlow jarg1_, int jarg2);
  public final static native void MaxFlow_getSourceSideMinCut(long jarg1, MaxFlow jarg1_, long jarg2);
  public final static native void MaxFlow_getSinkSideMinCut(long jarg1, MaxFlow jarg1_, long jarg2);
  public final static native void MaxFlow_setArcCapacity(long jarg1, MaxFlow jarg1_, int jarg2, long jarg3);
  public final static native void delete_MaxFlow(long jarg1);
  public final static native long new_MinCostFlowBase();
  public final static native void delete_MinCostFlowBase(long jarg1);
  public final static native long new_MinCostFlow();
  public final static native int MinCostFlow_addArcWithCapacityAndUnitCost(long jarg1, MinCostFlow jarg1_, int jarg2, int jarg3, long jarg4, long jarg5);
  public final static native void MinCostFlow_setNodeSupply(long jarg1, MinCostFlow jarg1_, int jarg2, long jarg3);
  public final static native int MinCostFlow_solve(long jarg1, MinCostFlow jarg1_);
  public final static native int MinCostFlow_solveMaxFlowWithMinCost(long jarg1, MinCostFlow jarg1_);
  public final static native long MinCostFlow_getOptimalCost(long jarg1, MinCostFlow jarg1_);
  public final static native long MinCostFlow_getMaximumFlow(long jarg1, MinCostFlow jarg1_);
  public final static native long MinCostFlow_getFlow(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native int MinCostFlow_getNumNodes(long jarg1, MinCostFlow jarg1_);
  public final static native int MinCostFlow_getNumArcs(long jarg1, MinCostFlow jarg1_);
  public final static native int MinCostFlow_getTail(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native int MinCostFlow_getHead(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native long MinCostFlow_getCapacity(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native long MinCostFlow_getSupply(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native long MinCostFlow_getUnitCost(long jarg1, MinCostFlow jarg1_, int jarg2);
  public final static native void delete_MinCostFlow(long jarg1);
  public final static native long new_LinearSumAssignment();
  public final static native int LinearSumAssignment_addArcWithCost(long jarg1, LinearSumAssignment jarg1_, int jarg2, int jarg3, long jarg4);
  public final static native int LinearSumAssignment_getNumNodes(long jarg1, LinearSumAssignment jarg1_);
  public final static native int LinearSumAssignment_getNumArcs(long jarg1, LinearSumAssignment jarg1_);
  public final static native int LinearSumAssignment_getLeftNode(long jarg1, LinearSumAssignment jarg1_, int jarg2);
  public final static native int LinearSumAssignment_getRightNode(long jarg1, LinearSumAssignment jarg1_, int jarg2);
  public final static native long LinearSumAssignment_getCost(long jarg1, LinearSumAssignment jarg1_, int jarg2);
  public final static native int LinearSumAssignment_solve(long jarg1, LinearSumAssignment jarg1_);
  public final static native long LinearSumAssignment_getOptimalCost(long jarg1, LinearSumAssignment jarg1_);
  public final static native int LinearSumAssignment_getRightMate(long jarg1, LinearSumAssignment jarg1_, int jarg2);
  public final static native long LinearSumAssignment_getAssignmentCost(long jarg1, LinearSumAssignment jarg1_, int jarg2);
  public final static native void delete_LinearSumAssignment(long jarg1);
  public final static native long MinCostFlow_SWIGUpcast(long jarg1);
}
