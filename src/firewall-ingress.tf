resource "google_compute_firewall" "i13-ni-gcp" {
  name = "devsecops-fw-single-ip"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "135",
      "139",
      "445",
      "593"]
  }

  priority = 1300
  source_ranges = [
    "192.168.1.1/32"]
}