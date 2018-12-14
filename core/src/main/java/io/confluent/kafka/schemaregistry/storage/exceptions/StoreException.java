/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.schemaregistry.storage.exceptions;

/**
 * Error while performing an operation on a
 * * <code>io.confluent.kafka.schemaregistry.storage.Store</code>
 */
public class StoreException extends Exception {

  public StoreException(String message, Throwable cause) {
    super(message, cause);
  }

  public StoreException(String message) {
    super(message);
  }

  public StoreException(Throwable cause) {
    super(cause);
  }

  public StoreException() {
    super();
  }
}
