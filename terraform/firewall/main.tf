terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "4.5.0"
    }
  }
}

provider "google" {
  project     = "cloudflow-qa-gcp1"
}

variable "gcp_region" {

  default = "europe-west2"
}
variable "gcp_zone" {

  default = "europe-west2-a"
}

resource "google_compute_firewall" "mongo_firewall" {
  name    = "mongo-firewall"
  network = "aaa"
  direction = "INGRESS"
  allow {
    protocol = "tcp"
    ports    = ["27017"]
  }
  source_tags = ["mongo-db"]
}

resource "google_compute_network" "mservice_network" {
  name                    = "mservice-network"
  auto_create_subnetworks = false
}
resource "google_compute_subnetwork" "mservice_subnetwork" {
  name          = "mservice-subnetwork"
  ip_cidr_range = "10.2.0.0/16"

  network       = "aaa"
  secondary_ip_range {
    range_name    = "mservice-subnetwork-secondary-range"
    ip_cidr_range = "192.168.10.0/24"
  }
}
