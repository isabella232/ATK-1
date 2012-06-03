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
 * File Name   : TokenValue.java
 *
 * Created     : 16/07/2010
 * Author(s)   : HENAFF Mari-Mai
 */
package com.orange.atk.interpreter.ast;

public class TokenValue {
	  private String value;
	
	
	 public void setValue(String image) {
			value = image;
	 }

	public String getValue() {
			return value;
	 }
}
