/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-15 at 13:56:33 UTC 
 * Modify at your own risk.
 */

package com.example.ibrahim.myapplication.backend.messaging.model;

/**
 * Model definition for RegistrationRecordCollection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the messaging. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegistrationRecordCollection extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RegistrationRecord> items;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<RegistrationRecord> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public RegistrationRecordCollection setItems(java.util.List<RegistrationRecord> items) {
    this.items = items;
    return this;
  }

  @Override
  public RegistrationRecordCollection set(String fieldName, Object value) {
    return (RegistrationRecordCollection) super.set(fieldName, value);
  }

  @Override
  public RegistrationRecordCollection clone() {
    return (RegistrationRecordCollection) super.clone();
  }

}
