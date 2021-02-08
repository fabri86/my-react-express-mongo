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

case class TemperatueZoneStatus (
  /* the unique identifier for the zone */
  id: String,
  /* the name of the zone */
  name: Option[String] = None,
  /* the temperature in the zone */
  value: Double,
  /* the temperature units */
  units: Option[TemperatueZoneStatusEnums.Units] = None,
  /* the timestamp when the temperature was measured */
  timestamp: DateTime
) extends ApiModel

object TemperatueZoneStatusEnums {

  type Units = Units.Value
  object Units extends Enumeration {
    val Celsius = Value("celsius")
    val Fahrenheit = Value("fahrenheit")
  }

}

