terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "4.5.0"
    }
  }
}

provider "google2" {
  project     = "cloudflow-qa-gcp1"
}