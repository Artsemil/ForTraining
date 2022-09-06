terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "4.5.0"
    }
  }
}

provider "google" {
  credentials = file("cloudflow-qa-gcp1-90070c4eeb3d.json")
  project     = "cloudflow-qa-gcp1"
}