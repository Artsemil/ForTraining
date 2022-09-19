resource "google_compute_firewall" "o03-ni-gcp-copy" {
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