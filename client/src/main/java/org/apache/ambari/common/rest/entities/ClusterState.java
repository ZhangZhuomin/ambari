/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.common.rest.entities;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClusterType complex type.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ClusterState {
        
    /*
     *  Cluster is deployed w/ Hadoop stack and required services are up
     */
    public static final String CLUSTER_STATE_ACTIVE = "ACTIVE";
    
    /* 
     * Cluster nodes are reserved but may not be deployed w/ stack. If deployed w/ stack
     * then cluster services are down
     */
    public static final String CLUSTER_STATE_INACTIVE = "INACTIVE";
    
    /*
     * No nodes are reserved for the cluster
     */
    public static final String CLUSTER_STATE_ATTIC = "ATTIC";
    
    @XmlAttribute(required = true)
    protected String state;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deployTime;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlAttribute(required = true)
    protected boolean markForDeletionWhenInAttic = false;
    
    /**
     * @return the markForDeletionWhenInAttic
     */
    public boolean isMarkForDeletionWhenInAttic() {
        return markForDeletionWhenInAttic;
    }

    /**
     * @param markForDeletionWhenInAttic the markForDeletionWhenInAttic to set
     */
    public void setMarkForDeletionWhenInAttic(boolean markForDeletionWhenInAttic) {
        this.markForDeletionWhenInAttic = markForDeletionWhenInAttic;
    }

    /**
     * @return the creationTime
     */
    public XMLGregorianCalendar getCreationTime() {
            return creationTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setCreationTime(XMLGregorianCalendar creationTime) {
            this.creationTime = creationTime;
    }
    
    /**
     * @param creationTime the creationTime to set
     */
    public void setCreationTime(Date creationTime) throws Exception {
        if (creationTime == null) {
            this.creationTime = null;
        } else {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(creationTime);
            this.creationTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
    }

    /**
     * @return the deployTime
     */
    public XMLGregorianCalendar getDeployTime() {
            return deployTime;
    }

    /**
     * @param deployTime the deployTime to set
     */
    public void setDeployTime(XMLGregorianCalendar deployTime) {
            this.deployTime = deployTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setDeployTime(Date deployTime) throws Exception {
        if (deployTime == null) {
            this.deployTime = null;
        } else {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(deployTime);
            this.deployTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
    }
    
    /**
     * @return the lastUpdateTime
     */
    public XMLGregorianCalendar getLastUpdateTime() {
            return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(XMLGregorianCalendar lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setLastUpdateTime(Date lastUpdateTime) throws Exception {
        if (lastUpdateTime == null) {
            this.lastUpdateTime = null;
        } else {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(lastUpdateTime);
            this.lastUpdateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
    }
    
    /**
     * @return the state
     */
    public String getState() {
            return state;
    }

    /**
     * @param State the state to set
     */
    public void setState(String state) {
            this.state = state;
    }

}
