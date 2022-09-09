resource "google_compute_firewall" "o01-ni-gcp" {
  name = "devsecops-fw-all-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "all"
  }

  direction = "EGRESS"
  priority = "2000"
  destination_ranges = [
    "0.0.0.0/0"]
}

resource "google_compute_firewall" "o02-ni-gcp" {
  name = "devsecops-fw-single-port-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "21"]
  }

  direction = "EGRESS"
  priority = "2100"
  destination_ranges = [
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

  direction = "EGRESS"
  priority = "2200"
  destination_ranges = [
    "0.0.0.0/0"]
}


resource "google_compute_firewall" "o03-ni-gcp-copy" {
  name = "devsecops-fw-single-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "udp"
  }

  direction = "EGRESS"
  priority = "2300"
  destination_ranges = [
    "192.168.1.1/32"]
}

resource "google_compute_firewall" "o01-ni-gcp-copy" {
  name = "devsecops-fw-multi-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
  }

  direction = "EGRESS"
  priority = "2400"
  destination_ranges = [
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

  direction = "EGRESS"
  description = "EGRESS"
  priority = "2500"
  destination_ranges = [
    "192.168.0.0/16"]
}