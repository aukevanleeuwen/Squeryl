package org.squeryl

import dsl.ast.{TypedExpressionNode, ConstantExpressionNode}
import dsl.QueryDsl


trait CustomType {
  def wrappedValue: Any
}

trait CustomTypesMode extends QueryDsl {

  implicit def createConstantNodeOfScalarIntType(i: Int) =
    new ConstantExpressionNode[Int](i) with TypedExpressionNode[Int]

  implicit def createConstantNodeOfScalarStringType(s: String) =
    new ConstantExpressionNode[String](s, true) with TypedExpressionNode[String]

  implicit def createConstantNodeOfScalarDoubleType(i: Double) =
    new ConstantExpressionNode[Double](i) with TypedExpressionNode[Double]

  implicit def createConstantNodeOfScalarFloatType(i: Float) =
    new ConstantExpressionNode[Float](i) with TypedExpressionNode[Float]

  implicit def createConstantNodeOfScalarLongType(i: Long) =
    new ConstantExpressionNode[Long](i) with TypedExpressionNode[Long]

  implicit def createConstantNodeOfScalarBooleanType(i: Boolean) =
    new ConstantExpressionNode[Boolean](i) with TypedExpressionNode[Boolean]


// constant agregates are of rare (and questionnable) usefullness, but we support them in CustonTypesMode
// for the sake of completeness :  
//  implicit def createConstantNodeOfAgregateIntType(i: Int) =
//    new ConstantExpressionNode[Int](i) with AgregateIntOption
//
//  implicit def createConstantNodeOfAgregateStringType(s: String) =
//    new ConstantExpressionNode[String](s, true) with AgregateStringOption
//
//  implicit def createConstantNodeOfAgregateDoubleType(i: Double) =
//    new ConstantExpressionNode[Double](i) with AgregateDoubleOption
//
//  implicit def createConstantNodeOfAgregateFloatType(i: Float) =
//    new ConstantExpressionNode[Float](i) with AgregateFloatOption
//
//  implicit def createConstantNodeOfAgregateLongType(i: Long) =
//    new ConstantExpressionNode[Long](i) with AgregateLongOption
//
//  implicit def createConstantNodeOfAgregateBooleanType(i: Boolean) =
//    new ConstantExpressionNode[Boolean](i) with AgregateBoolean
}
