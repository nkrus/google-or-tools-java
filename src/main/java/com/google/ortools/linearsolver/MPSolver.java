/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

public class MPSolver {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPSolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPSolver obj) {
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
        main_research_linear_solverJNI.delete_MPSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MPVariable[] makeVarArray(int count, double lb, double ub, boolean integer) {
    MPVariable[] array = new MPVariable[count];
    for (int i = 0; i < count; ++i) {
      array[i] = makeVar(lb, ub, integer, "");
    }
    return array;
  }

  public MPVariable[] makeVarArray(int count, double lb, double ub, boolean integer,
                                   String var_name) {
    MPVariable[] array = new MPVariable[count];
    for (int i = 0; i < count; ++i) {
      array[i] = makeVar(lb, ub, integer, var_name + i);
    }
    return array;
  }

  public MPVariable[] makeNumVarArray(int count, double lb, double ub) {
    return makeVarArray(count, lb, ub, false);
  }

  public MPVariable[] makeNumVarArray(int count, double lb, double ub, String var_name) {
    return makeVarArray(count, lb, ub, false, var_name);
  }

  public MPVariable[] makeIntVarArray(int count, double lb, double ub) {
    return makeVarArray(count, lb, ub, true);
  }

  public MPVariable[] makeIntVarArray(int count, double lb, double ub, String var_name) {
    return makeVarArray(count, lb, ub, true, var_name);
  }

  public MPVariable[] makeBoolVarArray(int count) {
    return makeVarArray(count, 0.0, 1.0, true);
  }

  public MPVariable[] makeBoolVarArray(int count, String var_name) {
    return makeVarArray(count, 0.0, 1.0, true, var_name);
  }

  public MPSolver(String name, OptimizationProblemType problem_type) {
    this(main_research_linear_solverJNI.new_MPSolver(name, problem_type.swigValue()), true);
  }

  public static boolean supportsProblemType(OptimizationProblemType problem_type) {
    return main_research_linear_solverJNI.MPSolver_supportsProblemType(problem_type.swigValue());
  }

  public void clear() {
    main_research_linear_solverJNI.MPSolver_clear(swigCPtr, this);
  }

  public int numVariables() {
    return main_research_linear_solverJNI.MPSolver_numVariables(swigCPtr, this);
  }

  public MPVariable lookupVariableOrNull(String var_name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_lookupVariableOrNull(swigCPtr, this, var_name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeVar(double lb, double ub, boolean integer, String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeVar(swigCPtr, this, lb, ub, integer, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeNumVar(double lb, double ub, String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeNumVar(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeIntVar(double lb, double ub, String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeIntVar(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeBoolVar(String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeBoolVar(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public int numConstraints() {
    return main_research_linear_solverJNI.MPSolver_numConstraints(swigCPtr, this);
  }

  public MPConstraint lookupConstraintOrNull(String constraint_name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_lookupConstraintOrNull(swigCPtr, this, constraint_name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(double lb, double ub) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_0(swigCPtr, this, lb, ub);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint() {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(double lb, double ub, String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_2(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(String name) {
    long cPtr = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_3(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPObjective objective() {
    long cPtr = main_research_linear_solverJNI.MPSolver_objective(swigCPtr, this);
    return (cPtr == 0) ? null : new MPObjective(cPtr, false);
  }

  public ResultStatus solve() {
    return ResultStatus.swigToEnum(main_research_linear_solverJNI.MPSolver_solve__SWIG_0(swigCPtr, this));
  }

  public ResultStatus solve(MPSolverParameters param) {
    return ResultStatus.swigToEnum(main_research_linear_solverJNI.MPSolver_solve__SWIG_1(swigCPtr, this, MPSolverParameters.getCPtr(param), param));
  }

  public double[] computeConstraintActivities() {
  return main_research_linear_solverJNI.MPSolver_computeConstraintActivities(swigCPtr, this);
}

  public boolean verifySolution(double tolerance, boolean log_errors) {
    return main_research_linear_solverJNI.MPSolver_verifySolution(swigCPtr, this, tolerance, log_errors);
  }

  public void reset() {
    main_research_linear_solverJNI.MPSolver_reset(swigCPtr, this);
  }

  public boolean interruptSolve() {
    return main_research_linear_solverJNI.MPSolver_interruptSolve(swigCPtr, this);
  }

  public boolean setSolverSpecificParametersAsString(String parameters) {
    return main_research_linear_solverJNI.MPSolver_setSolverSpecificParametersAsString(swigCPtr, this, parameters);
  }

  public static double infinity() {
    return main_research_linear_solverJNI.MPSolver_infinity();
  }

  public void enableOutput() {
    main_research_linear_solverJNI.MPSolver_enableOutput(swigCPtr, this);
  }

  public void suppressOutput() {
    main_research_linear_solverJNI.MPSolver_suppressOutput(swigCPtr, this);
  }

  public long iterations() {
    return main_research_linear_solverJNI.MPSolver_iterations(swigCPtr, this);
  }

  public long nodes() {
    return main_research_linear_solverJNI.MPSolver_nodes(swigCPtr, this);
  }

  public double computeExactConditionNumber() {
    return main_research_linear_solverJNI.MPSolver_computeExactConditionNumber(swigCPtr, this);
  }

  public void setTimeLimit(long time_limit_milliseconds) {
    main_research_linear_solverJNI.MPSolver_setTimeLimit(swigCPtr, this, time_limit_milliseconds);
  }

  public long wallTime() {
    return main_research_linear_solverJNI.MPSolver_wallTime(swigCPtr, this);
  }

  public String exportModelAsLpFormat(MPModelExportOptions options) {
    return main_research_linear_solverJNI.MPSolver_exportModelAsLpFormat__SWIG_0(swigCPtr, this, MPModelExportOptions.getCPtr(options), options);
  }

  public String exportModelAsLpFormat() {
    return main_research_linear_solverJNI.MPSolver_exportModelAsLpFormat__SWIG_1(swigCPtr, this);
  }

  public String exportModelAsMpsFormat(MPModelExportOptions options) {
    return main_research_linear_solverJNI.MPSolver_exportModelAsMpsFormat__SWIG_0(swigCPtr, this, MPModelExportOptions.getCPtr(options), options);
  }

  public String exportModelAsMpsFormat() {
    return main_research_linear_solverJNI.MPSolver_exportModelAsMpsFormat__SWIG_1(swigCPtr, this);
  }

  public void setHint(SWIGTYPE_p_std__vectorT_operations_research__MPVariable_p_t variables, double[] values) {
    main_research_linear_solverJNI.MPSolver_setHint(swigCPtr, this, SWIGTYPE_p_std__vectorT_operations_research__MPVariable_p_t.getCPtr(variables), values);
  }

  public enum OptimizationProblemType {
    CLP_LINEAR_PROGRAMMING(main_research_linear_solverJNI.MPSolver_CLP_LINEAR_PROGRAMMING_get()),
    GLOP_LINEAR_PROGRAMMING(main_research_linear_solverJNI.MPSolver_GLOP_LINEAR_PROGRAMMING_get()),
    CBC_MIXED_INTEGER_PROGRAMMING(main_research_linear_solverJNI.MPSolver_CBC_MIXED_INTEGER_PROGRAMMING_get()),
    BOP_INTEGER_PROGRAMMING(main_research_linear_solverJNI.MPSolver_BOP_INTEGER_PROGRAMMING_get());

    public final int swigValue() {
      return swigValue;
    }

    public static OptimizationProblemType swigToEnum(int swigValue) {
      OptimizationProblemType[] swigValues = OptimizationProblemType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (OptimizationProblemType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + OptimizationProblemType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType(OptimizationProblemType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ResultStatus {
    OPTIMAL,
    FEASIBLE,
    INFEASIBLE,
    UNBOUNDED,
    ABNORMAL,
    NOT_SOLVED(main_research_linear_solverJNI.MPSolver_NOT_SOLVED_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ResultStatus swigToEnum(int swigValue) {
      ResultStatus[] swigValues = ResultStatus.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ResultStatus swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ResultStatus.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ResultStatus() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ResultStatus(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ResultStatus(ResultStatus swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum BasisStatus {
    FREE(main_research_linear_solverJNI.MPSolver_FREE_get()),
    AT_LOWER_BOUND,
    AT_UPPER_BOUND,
    FIXED_VALUE,
    BASIC;

    public final int swigValue() {
      return swigValue;
    }

    public static BasisStatus swigToEnum(int swigValue) {
      BasisStatus[] swigValues = BasisStatus.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (BasisStatus swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + BasisStatus.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private BasisStatus() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private BasisStatus(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private BasisStatus(BasisStatus swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
