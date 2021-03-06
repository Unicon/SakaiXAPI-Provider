/**
 * Copyright 2013 Unicon (R) Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.sakaiproject.lrs.expapi.model;

/**
 * Standard LRS Statement keys
 * 
 * @author Robert Long (rlong @ unicon.net)
 *
 */
public interface LRSKeys {

    public static enum LRSStatementKey {
        actor, context, object, result, stored, timestamp, verb;
    }

    public static enum LRSActorKey {
        mbox, name, objectType
    }

    public static enum LRSContextKey {
        contextActivities, instructor, revision
    }

    public static enum LRSVerbKey {
        id, display
    }

    public static enum LRSObjectKey {
        id, objectType, definition
    }

    public static enum LRSDefinitionKey {
        name, type, description
    }

    public static enum LRSScoreKey {
        max, min, raw, scaled
    }

    public static enum LRSResultKey {
        completion, duration, score, extensions, success, response
    }

}
