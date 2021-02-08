/**
 * home-iot-api
 * The API for the EatBacon IOT project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ForecastTemperature (
  low: Option[Double] = None,
  high: Option[Double] = None,
  morning: Option[Double] = None,
  day: Option[Double] = None,
  evening: Option[Double] = None,
  night: Option[Double] = None
) extends ApiModel


