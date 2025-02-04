/*
 * Copyright 2021 Google LLC
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

import javax.annotation.Nullable;

/**
 * Start and end range fields are equal for a certain GTFS entity.
 *
 * <p>Example: {@code start_time == end_time} for {@code frequencies.txt}.
 *
 * <p>Severity: {@code SeverityLevel.ERROR}
 */
public class StartAndEndRangeEqualNotice extends ValidationNotice {

  private final String filename;
  private final int csvRowNumber;
  @Nullable private final String entityId;
  private final String startFieldName;
  private final String endFieldName;
  private final String value;

  public StartAndEndRangeEqualNotice(
      String filename,
      int csvRowNumber,
      String entityId,
      String startFieldName,
      String endFieldName,
      String value) {
    super(SeverityLevel.ERROR);
    this.filename = filename;
    this.csvRowNumber = csvRowNumber;
    this.entityId = entityId;
    this.startFieldName = startFieldName;
    this.endFieldName = endFieldName;
    this.value = value;
  }

  public StartAndEndRangeEqualNotice(
      String filename, int csvRowNumber, String startFieldName, String endFieldName, String value) {
    super(SeverityLevel.ERROR);
    this.filename = filename;
    this.csvRowNumber = csvRowNumber;
    this.entityId = null;
    this.startFieldName = startFieldName;
    this.endFieldName = endFieldName;
    this.value = value;
  }
}
