# Ref - https://www.terraform.io/docs/providers/google/r/storage_bucket.html
variable "gcp_project" {
  type    = "string"
  default = "protean-1217618"
}
variable "gcp_region" {
  type    = "string"
  default = "europe-west2"
}
variable "gcp_zone" {
  type    = "string"
  default = "europe-west2-a"
}

