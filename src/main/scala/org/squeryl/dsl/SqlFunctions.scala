package org.squeryl.dsl

import ast.{TypedExpressionNode, TokenExpressionNode, FunctionNode}

/*


*/
trait SqlFunctions  {
  self: ExpressionDsl =>

//  def max(e: ScalarInt)      = new FunctionNode("max",e) with AgregateIntOption
//  def max(e: ScalarDouble)   = new FunctionNode("max",e) with AgregateDoubleOption
//  def max(e: ScalarFloat)    = new FunctionNode("max",e) with AgregateFloatOption
//  def max(e: BaseScalarString)   = new FunctionNode("max",e) with AgregateStringOption
//  def max(e: ScalarLong)     = new FunctionNode("max",e) with AgregateLongOption
//  def max(e: ScalarIntOption)      = new FunctionNode("max",e) with AgregateIntOption
//  def max(e: ScalarDoubleOption)   = new FunctionNode("max",e) with AgregateDoubleOption
//  def max(e: ScalarFloatOption)    = new FunctionNode("max",e) with AgregateFloatOption
////  def max(e: ScalarStringOption)   = new FunctionNode("max",e) with AgregateStringOption
//  def max(e: ScalarLongOption)     = new FunctionNode("max",e) with AgregateLongOption
//  def max(e: ScalarBoolean)     = new FunctionNode("max",e) with AgregateBooleanOption
//  def max(e: ScalarBooleanOption)     = new FunctionNode("max",e) with AgregateBooleanOption
//  def max(e: BaseScalarDate)     = new FunctionNode("max",e) with AgregateDateOption
//
//  def min(e: ScalarInt)      = new FunctionNode("min",e) with AgregateIntOption
//  def min(e: ScalarDouble)   = new FunctionNode("min",e) with AgregateDoubleOption
//  def min(e: ScalarFloat)    = new FunctionNode("min",e) with AgregateFloatOption
//  def min(e: BaseScalarString)   = new FunctionNode("min",e) with AgregateStringOption
//  def min(e: ScalarLong)     = new FunctionNode("min",e) with AgregateLongOption
//  def min(e: ScalarIntOption)      = new FunctionNode("min",e) with AgregateIntOption
//  def min(e: ScalarDoubleOption)   = new FunctionNode("min",e) with AgregateDoubleOption
//  def min(e: ScalarFloatOption)    = new FunctionNode("min",e) with AgregateFloatOption
////BaseScalarString  def min(e: ScalarStringOption)   = new FunctionNode("min",e) with AgregateStringOption
//  def min(e: ScalarLongOption)     = new FunctionNode("min",e) with AgregateLongOption
//  def min(e: ScalarBoolean)     = new FunctionNode("min",e) with AgregateBooleanOption
//  def min(e: ScalarBooleanOption)     = new FunctionNode("min",e) with AgregateBooleanOption
//  def min(e: BaseScalarDate)     = new FunctionNode("min",e) with AgregateDateOption
//
//  //TODO: introduce Numeric4 and Numeric8 (byte,int,float) and (long, double) and have only 2 Avg Signatures ?
//  def avg(e: ScalarInt)      = new FunctionNode("avg",e) with AgregateFloatOption
//  def avg(e: ScalarDouble)   = new FunctionNode("avg",e) with AgregateDoubleOption
//  def avg(e: ScalarFloat)    = new FunctionNode("avg",e) with AgregateFloatOption
//  def avg(e: ScalarLong)     = new FunctionNode("avg",e) with AgregateDoubleOption
//  def avg(e: ScalarIntOption)      = new FunctionNode("avg",e) with AgregateFloatOption
//  def avg(e: ScalarDoubleOption)   = new FunctionNode("avg",e) with AgregateDoubleOption
//  def avg(e: ScalarFloatOption)    = new FunctionNode("avg",e) with AgregateFloatOption
//  def avg(e: ScalarLongOption)     = new FunctionNode("avg",e) with AgregateDoubleOption
//
  def count                  = new FunctionNode("count", new TokenExpressionNode("*")) with TypedExpressionNode[LongType]
//
//  //TODO: eliminate, replace with || since this form can't deal with *non null* absorbance,
//  // contrary to number operations, string concat has absorbance of non nulls
//  // for convenience, Concat returns an empty instead of null, so the return type is ScalarString, not ScalarStringOption
//  def concat(e: TypedExpressionNode[Scalar,_]*) = new ConcatFunction(e) with ScalarString
//
//  def nvl(e: ScalarInt, v: ScalarInt)      = new FunctionNode("nvl",e,v) with ScalarIntOption
//  def nvl(e: ScalarDouble, v: ScalarDouble)   = new FunctionNode("nvl",e,v) with ScalarDoubleOption
//  def nvl(e: ScalarFloat, v: ScalarFloat)    = new FunctionNode("nvl",e,v) with ScalarFloatOption
//  def nvl(e: ScalarLong, v: ScalarLong)     = new FunctionNode("nvl",e,v) with ScalarLongOption
//  def nvl(e: ScalarIntOption, v: ScalarIntOption)      = new FunctionNode("nvl",e,v) with ScalarIntOption
//  def nvl(e: ScalarDoubleOption, v: ScalarDoubleOption)   = new FunctionNode("nvl",e,v) with ScalarDoubleOption
//  def nvl(e: ScalarFloatOption, v: ScalarFloatOption)    = new FunctionNode("nvl",e,v) with ScalarFloatOption
//  def nvl(e: ScalarLongOption, v: ScalarLongOption)     = new FunctionNode("nvl",e,v) with ScalarLongOption
//
////  def nvl(e: ScalarNumerical, v: ScalarInt)      = new FunctionNode("nvl",e,v) with ScalarIntOption
////  def nvl(e: ScalarNumerical, v: ScalarDouble)   = new FunctionNode("nvl",e,v) with ScalarDoubleOption
////  def nvl(e: ScalarNumerical, v: ScalarFloat)    = new FunctionNode("nvl",e,v) with ScalarFloatOption
////  def nvl(e: ScalarNumerical, v: ScalarLong)     = new FunctionNode("nvl",e,v) with ScalarLongOption
////  def nvl(e: ScalarNumerical, v: ScalarIntOption)      = new FunctionNode("nvl",e,v) with ScalarIntOption
////  def nvl(e: ScalarNumerical, v: ScalarDoubleOption)   = new FunctionNode("nvl",e,v) with ScalarDoubleOption
////  def nvl(e: ScalarNumerical, v: ScalarFloatOption)    = new FunctionNode("nvl",e,v) with ScalarFloatOption
////  def nvl(e: ScalarNumerical, v: ScalarLongOption)     = new FunctionNode("nvl",e,v) with ScalarLongOption
//
//  //def nvl(e: ScalarNumerical, v: ScalarNumerical)     = new FunctionNode("nvl",e,v) with ScalarNumerical
//  def nvl(e: ScalarBoolean, v: ScalarBoolean)     = new FunctionNode("nvl",e,v) with ScalarBooleanOption
//  def nvl(e: ScalarBooleanOption, v: ScalarBooleanOption)     = new FunctionNode("nvl",e,v) with ScalarBooleanOption
//  def nvl(e: BaseScalarString, v: BaseScalarString)   = new FunctionNode("nvl",e,v) with ScalarStringOption
//  def nvl(e: ScalarStringOption, v: ScalarStringOption)   = new FunctionNode("nvl",e,v) with ScalarStringOption
//  def nvl(e: BaseScalarDate, v: BaseScalarDate)     = new FunctionNode("nvl",e,v) with ScalarDateOption
}