# Ref - https://www.terraform.io/docs/providers/google/r/composer_environment.html
variable "gcp_project" {
  type    = "string"
  default = "protean-1217618"
}

variable "gcp_region" {
  type    = "string"
  default = "europe-west1"
}

variable "gcp_zone" {
  type    = "string"
  default = "europe-west1-a"
}


resource "google_composer_environment" "mservice_composer" {
  name   = "mservice-composer"


  config {
    node_count = 3


  }
}

resource "google_compute_network" "composer_qa_network" {
  name                    = "composer-qa-network"
  auto_create_subnetworks = false
}

resource "google_compute_subnetwork" "composer_qa_subnetwork" {
  name          = "composer-qa-subnetwork"
  ip_cidr_range = "10.2.0.0/16"

  network       = "aaa"
}
