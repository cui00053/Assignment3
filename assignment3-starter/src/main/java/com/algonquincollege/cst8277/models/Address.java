/********************************************************************egg***m******a**************n************
 * File: Address.java
 * Course materials (19W) CST 8277
 * @author Mike Norman
 * (Modified) @date 2019 03
 *
 * Copyright (c) 1998, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Original @authors dclarke, mbraeuer
 *
 */
package com.algonquincollege.cst8277.models;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Simple Address class - it uses a generated Id.
 */
@Entity
public class Address extends ModelBase implements Serializable {
    /** explicit set serialVersionUID */
    private static final long serialVersionUID = 1L;

    // TODO - additional persistent field

    // JPA requires each @Entity class have a default constructor
    public Address() {
        super();
    }

    // Strictly speaking, JPA does not require hashcode() and equals(),
    // but it is a good idea to have one that tests using the PK (@Id) field

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address other = (Address)obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

}