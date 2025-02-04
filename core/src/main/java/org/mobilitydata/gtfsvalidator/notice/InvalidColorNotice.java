/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mobilitydata.gtfsvalidator.notice;

/**
 * A field contains an invalid color value.
 *
 * <p>A color must be encoded as a six-digit hexadecimal number. The leading "#" is not included.
 *
 * <p>Example: {@code FFFFFF} for white, {@code 000000} for black or {@code 0039A6} for the A,C,E
 * lines in NYMTA.
 *
 * <p>Severity: {@code SeverityLevel.ERROR}
 */
public class InvalidColorNotice extends ValidationNotice {
  private final String filename;
  private final int csvRowNumber;
  private final String fieldName;
  private final String fieldValue;

  public InvalidColorNotice(
      String filename, int csvRowNumber, String fieldName, String fieldValue) {
    super(SeverityLevel.ERROR);
    this.filename = filename;
    this.csvRowNumber = csvRowNumber;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }
}
