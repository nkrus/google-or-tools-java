/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RegularLimit extends SearchLimit {
  private transient long swigCPtr;

  protected RegularLimit(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.RegularLimit_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RegularLimit obj) {
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
        mainJNI.delete_RegularLimit(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RegularLimit(Solver s, long time, long branches, long failures, long solutions, boolean smart_time_check, boolean cumulative) {
    this(mainJNI.new_RegularLimit(Solver.getCPtr(s), s, time, branches, failures, solutions, smart_time_check, cumulative), true);
  }

  public void copy(SearchLimit limit) {
    mainJNI.RegularLimit_copy(swigCPtr, this, SearchLimit.getCPtr(limit), limit);
  }

  public SearchLimit makeClone() {
    long cPtr = mainJNI.RegularLimit_makeClone(swigCPtr, this);
    return (cPtr == 0) ? null : new SearchLimit(cPtr, false);
  }

  public RegularLimit MakeIdenticalClone() {
    long cPtr = mainJNI.RegularLimit_MakeIdenticalClone(swigCPtr, this);
    return (cPtr == 0) ? null : new RegularLimit(cPtr, false);
  }

  public boolean check() {
    return mainJNI.RegularLimit_check(swigCPtr, this);
  }

  public void init() {
    mainJNI.RegularLimit_init(swigCPtr, this);
  }

  public void exitSearch() {
    mainJNI.RegularLimit_exitSearch(swigCPtr, this);
  }

  public void UpdateLimits(long time, long branches, long failures, long solutions) {
    mainJNI.RegularLimit_UpdateLimits(swigCPtr, this, time, branches, failures, solutions);
  }

  public SWIGTYPE_p_absl__Duration duration_limit() {
    return new SWIGTYPE_p_absl__Duration(mainJNI.RegularLimit_duration_limit(swigCPtr, this), true);
  }

  public long wall_time() {
    return mainJNI.RegularLimit_wall_time(swigCPtr, this);
  }

  public long branches() {
    return mainJNI.RegularLimit_branches(swigCPtr, this);
  }

  public long failures() {
    return mainJNI.RegularLimit_failures(swigCPtr, this);
  }

  public long solutions() {
    return mainJNI.RegularLimit_solutions(swigCPtr, this);
  }

  public boolean IsUncheckedSolutionLimitReached() {
    return mainJNI.RegularLimit_IsUncheckedSolutionLimitReached(swigCPtr, this);
  }

  public int progressPercent() {
    return mainJNI.RegularLimit_progressPercent(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.RegularLimit_toString(swigCPtr, this);
  }

  public SWIGTYPE_p_absl__Time AbsoluteSolverDeadline() {
    return new SWIGTYPE_p_absl__Time(mainJNI.RegularLimit_AbsoluteSolverDeadline(swigCPtr, this), true);
  }

  public void accept(ModelVisitor visitor) {
    mainJNI.RegularLimit_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

}
