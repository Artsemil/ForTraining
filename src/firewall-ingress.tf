resource "google_compute_firewall" "i01-ni-gcp" {
  name = "devsecops-fw-all"
  network = "devsecops-network-gcp"


  deny {
    protocol  = "udp"
  }

  description = "INGRESS"
  direction = "INGRESS"
  priority = 1000
  source_ranges = [
    "0.0.0.0/0"]
}