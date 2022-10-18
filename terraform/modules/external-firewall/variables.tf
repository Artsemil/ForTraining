# ---------------------------------------------------------------------------------------------------------------------
# REQUIRED PARAMETERS
# You must provide a value for each of these parameters.
# ---------------------------------------------------------------------------------------------------------------------

variable "project" {
  description = "ID of the GCP Project where all resources will be launched."
  type        = string
  default = "cloudflow-qa-gcp1"
}

variable "name_prefix" {
  description = "This variable is used to namespace all resources created by this module."
  type        = string
  default = "test"
}

variable "target_tags" {
  description = "The target tags define the compute instances to which the rules apply."
  type        = list(string)
  default = ["hello"]
}

variable "network" {
  description = "The name or self link of the VPC network in which to deploy the InfluxDB cluster"
  type        = string
  default = "network"
}

# ---------------------------------------------------------------------------------------------------------------------
# OPTIONAL PARAMETERS
# These parameters have reasonable defaults.
# ---------------------------------------------------------------------------------------------------------------------

variable "ports" {
  description = "An optional list of ports or port ranges to which this rule applies. If not specified, this rule applies to connections through any port."
  type        = list(string)
  default     = [443]
}

variable "protocol" {
  description = "The IP protocol to which this rule applies."
  type        = string
  default     = "tcp"
}

variable "allow_access_from_cidr_blocks" {
  description = "The list of CIDR-formatted IP address ranges from which access will be allowed."
  type        = list(string)
  default     = ["10.0.0.0/32"]
}

