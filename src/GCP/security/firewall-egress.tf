resource "google_compute_firewall" "o02-ni-gcp" {
  name = "devsecops-fw-all-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "all"
  }

  description = "EGRESS"
  source_ranges = [
    "0.0.0.0/0"]
}

resource "google_compute_firewall" "o05-ni-gcp" {
  name = "devsecops-fw-single-port-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "21"]
  }

  description = "EGRESS"
  source_ranges = [
    "0.0.0.0/0"]
}


resource "google_compute_firewall" "o06-ni-gcp" {
  name = "devsecops-fw-multi-ports-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "25-400",
      "465", "587"]
  }

  description = "EGRESS"
  source_ranges = [
    "0.0.0.0/0"]
}


resource "google_compute_firewall" "o07-ni-gcp" {
  name = "devsecops-fw-single-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "udp"
    ports = [
      "all"]
  }

  description = "EGRESS"
  source_ranges = [
    "192.168.1.1/32"]
}

resource "google_compute_firewall" "o01-ni-gcp" {
  name = "devsecops-fw-multi-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "all"]
  }

  description = "EGRESS"
  source_ranges = [
    "192.168.1.1/32",
    "192.168.1.2/32",
    "192.168.1.3/32",
    "192.168.1.4/32",
    "192.168.1.5/32"]
}

resource "google_compute_firewall" "o03-ni-gcp" {
  name = "devsecops-fw-cidr-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "udp"
  }

  description = "EGRESS"
  source_ranges = [
    "192.168.0.0/16"]
}