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
 * File Name   : Node.java
 *
 * Created     : 21/05/2010
 * Author(s)   : HENAFF Mari-Mai
 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orange.atk.interpreter.ast;

import com.orange.atk.interpreter.parser.ATKScriptParserVisitor;

/* All AST nodes must implement this interface.  It provides basic
   machinery for constructing the parent and child relationships
   between nodes. */

public
interface Node {

  /** This method is called after the node has been made the current
    node.  It indicates that child nodes can now be added to it. */
  public void jjtOpen();

  /** This method is called after all the child nodes have been
    added. */
  public void jjtClose();

  /** This pair of methods are used to inform the node of its
    parent. */
  public void jjtSetParent(Node n);
  public Node jjtGetParent();

  /** This method tells the node to add its argument to the node's
    list of children.  */
  public void jjtAddChild(Node n, int i);

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
  public Node jjtGetChild(int i);

  /** Return the number of children the node has. */
  public int jjtGetNumChildren();

  /** Accept the visitor. **/
  public Object jjtAccept(ATKScriptParserVisitor visitor, Object data);

  // BEGIN - Methods MANUALLY added
  public int jjtGetID();

  /** This method tells the node to remove this position to the node's
    list of children.  */
  public void jjtRemoveChild(int i);

  /** This method tells the node to insert its argument at the position to the node's
  list of children.  */
  public void jjtInsertChild(Node n, int i);
  // END - Methods MANUALLY added
}
/* JavaCC - OriginalChecksum=c9e941a5b8b5f108742f3de449bbb556 (do not edit this line) */
