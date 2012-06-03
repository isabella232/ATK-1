/*
 * Software Name : ATK
 *
 * Copyright (C) 2007 - 2012 France Télécom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ------------------------------------------------------------------
 * File Name   : BoolExprAnd.java
 *
 * Created     : 04/04/2007
 * Author(s)   : Aurore PENAULT
 */
package com.orange.atk.atkUI.corecli.reportGenerator.bind;

import java.io.Serializable;
import java.util.Vector;

import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitable;
import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitor;

/**
 * Represents the boolean expression: <code>and</code>.
 * @author penaulau
 * @since JDK5.0
 */
public class BoolExprAnd extends BoolExpr implements Visitable, Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Contains the both sides of this boolean expression.
	 */
	private Vector<Expr> twoExpr;

	/**
	 * Default constructor.
	 *
	 */
	public BoolExprAnd() {
		twoExpr = new Vector<Expr>();
	}

	/**
	 * Returns the both sides of this boolean expression.
	 * @return the both sides of this boolean expression
	 */
	public Vector<Expr> getTwoExpr() {
		return twoExpr;
	}

	/**
	 * Sets the both sides of this boolean expression.
	 * @param twoExpr the vector which contains the left hand side and the right hand side of this boolean expression
	 */
	public void setTwoExpr(Vector<Expr> twoExpr) {
		this.twoExpr = twoExpr;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * @param v a concrete visitor
	 */
	public void accept(Visitor v) {
		v.visit_And(this);
	}
}
